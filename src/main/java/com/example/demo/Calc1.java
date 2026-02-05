package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calc1 {
  @GetMapping("/calc/{oper}/{n1}/{n2}")
  public String calc(@PathVariable String oper,
		  @PathVariable int n1,
		  @PathVariable int n2) {
	  int res=0;
	  if(oper.equals("suma")) {
		  res=n1 + n2;
	  }else if (oper.equals("resta")) {
		  res= n1 - n2;
	  }else if (oper.equals("div")) {
		  res= n1* n2;
	  }
	  return "Resultado=" + res;
  }
}
