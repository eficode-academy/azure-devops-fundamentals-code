package com.example;

class FeatureToggle {
  public static boolean getWorkingFlag() {
    return System.getenv("WORKING") != null;
  }
}