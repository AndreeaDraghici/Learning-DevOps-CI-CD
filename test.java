/**
 * this file represent the JUnit test Demo
 * DevOps foundations: CI/CD course
 * Linkedin learning
 *
 */

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


class SampleJUnitTest{

  @Test
  void demoTestMehod(){
      assertTrue(true);
  }

  @Test
  void muliplyTest(){
	  assertEquals(20,multiply(4,5),"Regular multiplication should work");
  }

  private int multiply(int a, int b){
    return a*b;
  }
}
