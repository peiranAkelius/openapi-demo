package com.akelius.openapi.demo;

import com.akelius.openapi.demo.controller.ContractTenantApi;
import com.akelius.openapi.demo.model.ContractTenantDto;
import com.akelius.openapi.demo.model.ContractTenantRequestDto;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class DataAccessController implements ContractTenantApi {
  @Override
  public Flux<ContractTenantDto> contractTenantPost(final Mono<ContractTenantRequestDto> contractTenantRequestDto, final ServerWebExchange exchange) {
    final ContractTenantDto result = new ContractTenantDto()
      .contractNumber("1001")
      .email("piraten@de.com");
    return Flux.just(result);
  }
}
