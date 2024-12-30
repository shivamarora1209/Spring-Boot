package com.example.ProductMicroservice.Dto;

import com.example.ProductMicroservice.Entity.Category;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {
	
	private String name ;
	private double price ;
	private String description ;
	private CategoryDto category ;
}