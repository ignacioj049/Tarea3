package org.example;

class PagoIncorrectoException extends Exception {
  public PagoIncorrectoException(String message) {
    super(message);
  }
}

class NoHayProductoException extends Exception {
  public NoHayProductoException(String message) {
    super(message);
  }
}

class PagoInsuficienteException extends Exception {
  public PagoInsuficienteException(String message) {
    super(message);
  }
}
