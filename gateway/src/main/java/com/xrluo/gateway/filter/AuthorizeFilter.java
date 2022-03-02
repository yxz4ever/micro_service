package com.xrluo.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 全局过滤器
 */
@Order(0)
@Component
public class AuthorizeFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 1. 获取请求参数
        ServerHttpRequest             request     = exchange.getRequest();
        MultiValueMap<String, String> queryParams = request.getQueryParams();
        // 2. 获取参数中的authorization参数
        String auth = queryParams.getFirst("authorization");
        // 3. 判断参数值是否等于admin
        if ("admin".equals(auth)) {
            // 4. 是放行
            return chain.filter(exchange);
        } else {
            // 5. 否拦截
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        }
    }
}
