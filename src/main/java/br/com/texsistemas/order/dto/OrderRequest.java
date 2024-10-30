package br.com.texsistemas.order.dto;

public record OrderRequest(
        Long id,
        String orderNumber,
        String skuCode,
        Double price,
        Integer quantity
) {
}
