package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Calc1 {
  @GetMapping("/calc/{oper}")
  public String calc(@PathVariable String oper,
		  @RequestParam (value = "n1", defaultValue = "0") int n1,
		  @RequestParam (value = "n2", defaultValue = "0")int n2) {
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
