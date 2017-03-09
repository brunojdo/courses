package com.danielfireman.courses.map.abstractfactory;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

/**
 * Good example of the abstract factory.
 * see: https://brizeno.wordpress.com/category/padroes-de-projeto/abstract-factory/
 */
class Good1 {
  interface FabricaDeCarro {
    CarroSedan criarCarroSedan();
    CarroPopular criarCarroPopular();
  }
  class FabricaFiat implements FabricaDeCarro {
 
    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }
 
    @Override
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }
  }
  
  interface CarroPopular {
    void exibirInfoPopular();
  }
  interface CarroSedan {
    void exibirInfoSedan();
  }
  
  class Palio implements CarroPopular {
 
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Palio\nFábrica: Fiat\nCategoria:Popular");
    }
  }
  class Siena implements CarroSedan {
 
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Siena\nFábrica: Fiat\nCategoria:Sedan");
    }
  }
  public static void main(String[] args) {
    FabricaDeCarro fabrica = new FabricaFiat();
    CarroSedan sedan = fabrica.criarCarroSedan();
    CarroPopular popular = fabrica.criarCarroPopular();
    sedan.exibirInfoSedan();
    System.out.println();
    popular.exibirInfoPopular();
    System.out.println();
 
    fabrica = new FabricaFord();
    sedan = fabrica.criarCarroSedan();
    popular = fabrica.criarCarroPopular();
    sedan.exibirInfoSedan();
    System.out.println();
    popular.exibirInfoPopular();
  }
}
