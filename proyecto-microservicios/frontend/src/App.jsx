import React, { useEffect, useState } from 'react';

function App() {
  const [students, setStudents] = useState([]);

  useEffect(() => {
    // Fetch a la ruta configurada en Nginx
    fetch('/api/students/with-grades')
      .then(res => res.json())
      .then(data => setStudents(data))
      .catch(err => console.error("Error cargando datos:", err));
  }, []);

  // Función para calcular promedio
  const calculateAverage = (grades) => {
    if (!grades || grades.length === 0) return 0;
    const sum = grades.reduce((acc, curr) => acc + curr.grade, 0);
    return (sum / grades.length).toFixed(2);
  };

  // Función para el color según la nota (regla del video)
  const getColor = (grade) => {
    if (grade > 8) return 'green';
    if (grade < 6) return 'red';
    return '#bfbf00'; // Amarillo oscuro para intermedio
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>Lista de Estudiantes y Notas</h1>
      <table border="1" cellPadding="10" style={{ borderCollapse: 'collapse', width: '100%' }}>
        <thead>
          <tr style={{ backgroundColor: '#f0f0f0' }}>
            <th>Estudiante</th>
            <th>Materias y Notas</th>
            <th>Promedio</th>
          </tr>
        </thead>
        <tbody>
          {students.map((student) => {
            const avg = calculateAverage(student.grades);
            return (
              <tr key={student.id}>
                <td>{student.fullname}</td>
                <td>
                  <ul>
                    {student.grades.map(g => (
                      <li key={g.id}>
                        {g.subject}: <b>{g.grade}</b>
                      </li>
                    ))}
                  </ul>
                </td>
                <td style={{ color: getColor(avg), fontWeight: 'bold', fontSize: '1.2em' }}>
                  {avg}
                </td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
}

export default App;