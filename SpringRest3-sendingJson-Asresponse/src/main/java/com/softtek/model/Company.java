package com.softtek.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
	private String cname;
	private String addrs;
	private String ctype;
	private Integer size;
}
