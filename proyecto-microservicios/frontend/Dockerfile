# Etapa 1: Build
FROM node:18-alpine as build
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build

# Etapa 2: Nginx
FROM nginx:alpine
# Copiamos el build de React a Nginx
COPY --from=build /app/dist /usr/share/nginx/html
# Copiamos nuestra config de Nginx
COPY nginx.conf /etc/nginx/nginx.conf
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]