package gov.va.api.health.communitycareeligibility.service;

import lombok.experimental.UtilityClass;

@UtilityClass
final class Exceptions {
  static final class BingMapsUnavailableException extends RuntimeException {
    BingMapsUnavailableException() {
      super("Bing Maps API is not available");
    }
  }

  static final class FacilitiesUnavailableException extends RuntimeException {
    FacilitiesUnavailableException() {
      super("Facilities API is not available");
    }
  }

  static final class MalformedPatientIcnException extends RuntimeException {
    MalformedPatientIcnException(String patientIcn, Throwable cause) {
      super("Malformed patient ICN: " + patientIcn, cause);
    }
  }

  static final class UnknownPatientIcnException extends RuntimeException {
    UnknownPatientIcnException(String patientIcn, Throwable cause) {
      super("Unknown patient ICN: " + patientIcn, cause);
    }
  }

  static final class UnknownServiceTypeException extends RuntimeException {
    UnknownServiceTypeException(String serviceType) {
      super("Unknown service type: " + serviceType);
    }
  }
}