package ec.edu.sudamericano.gateway.debug

import org.springframework.cloud.gateway.filter.GatewayFilterChain
import org.springframework.cloud.gateway.filter.GlobalFilter
import org.springframework.stereotype.Component
import org.springframework.web.server.ServerWebExchange
import reactor.core.publisher.Mono

@Component
class LoggingGatewayFilter : GlobalFilter {
    override fun filter(exchange: ServerWebExchange, chain: GatewayFilterChain): Mono<Void> {
        val request = exchange.request
       // println("🟢 GATEWAY RECIBIÓ: ${request.method} ${request.uri}")
        return chain.filter(exchange)
    }
}