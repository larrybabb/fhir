package org.hl7.fhir.instance.model;

public class Enumeration<T extends Enum> extends Element {

  private T value;
  
  public T getValue() {
    return value;
  }
  
  public void setValue(T value) {
    this.value = value;
  }
}
