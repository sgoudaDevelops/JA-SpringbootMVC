package com.softtek.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
 private  Integer cno;
 private String cname;
 private String caddrs;
 private Float billAmnt;
 private String[] favcolors;
 private List<String> studies;
 private Set<Long> phoneNumber;
 private Map<String , Object> iddetails;
	 //has - a property
 private Company company;
}
