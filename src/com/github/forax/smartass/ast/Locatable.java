package com.github.forax.smartass.ast;

abstract class Locatable {
  private final Location location;

  Locatable(Location location) {
    this.location = location;
  }
  
  public Location getLocation() {
    return location;
  }
}
