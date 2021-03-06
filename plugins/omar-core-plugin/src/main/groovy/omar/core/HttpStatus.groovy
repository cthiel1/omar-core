package omar.core

public class HttpStatus {

  public static def ERROR = "error"
  public static def SUCCESS = "success"

  // Informational repsonses 1xx
  public static def CONTINUE    = 100
  public static def SWITCHING_PROTOCOLS = 101
  public static def PROCESSING = 102


  // Successful responses 2xx
  public static def OK       = 200
  public static def CREATED  = 201
  public static def ACCEPTED = 202
  public static def NON_AUTHORITATIVE_INFORMATION = 203
  public static def NO_CONTENT = 204
  public static def RESET_CONTENT = 205
  public static def PARTIAL_CONTENT = 206
  public static def MULTI_STATUS = 207
  public static def ALREADY_REPORTED = 208
  public static def IM_USED = 226

  // redirection  responses 3xx
  public static def MULTIPLE_CHOICES = 300
  public static def MOVED_PERMANENTLY = 301
  public static def FOUND = 302
  public static def SEE_OTHER = 303
  public static def NOT_MODIFIED = 304
  public static def USE_PROXY = 305
  public static def TEMPORARY_REDIRECT = 307

  // client errors 4xx
  public static def BAD_REQUEST = 400
  public static def UNAUTHORIZED = 401
  public static def PAYMENT_REQUIRED = 402
  public static def FORBIDDEN = 403
  public static def NOT_FOUND = 404
  public static def METHOD_NOT_ALLOWED = 405
  public static def NOT_ACCEPTABLE = 406
  public static def PROXY_AUTHENTICATION_REQUIRED = 407
  public static def REQUEST_TIMEOUT = 408
  public static def CONFLICT = 409
  public static def GONE = 410
  public static def LENGTH_REQUIRED = 411
  public static def PRECONDITION_FAILED = 412
  public static def REQUEST_ENTITY_TOO_LARGE = 413
  public static def REQUEST_URI_TOO_LONG = 414
  public static def UNSUPPORTED_MEDIA_TYPE = 415
  public static def REQUESTED_RANGE_NOT_SATISFIABLE = 416
  public static def EXPECTATION_FAILED = 417
  public static def MISDIRECTED_REQUEST = 421
  public static def UNPROCESSIBLE_ENTITY = 422
  public static def LOCKED = 423
  public static def FAILED_DEPENDENCY = 424
  public static def UPGRADE_REQUIRED = 426
  public static def PRECONDITION_REQUIRED = 428
  public static def TOO_MANY_REQUESTS = 429
  public static def REQUEST_HEADER_FIELDS_TOO_LARGE = 431
  public static def UNAVAILABLE_FOR_LEGAL_REASONS = 451

// server error responses 5xx
  public static def INTERNAL_SERVER_ERROR = 500
  public static def NOT_IMPLEMENTED = 501
  public static def BAD_GATEWAY = 502
  public static def SERVER_UNAVAILABLE = 503
  public static def GATEWAY_TIMEOUT = 504
  public static def HTTP_VERSION_NOT_SUPPORTED = 505
  public static def VARIANT_ALSO_NEGOTIATES = 506
  public static def INSUFFICIENT_STORAGE = 507
  public static def LOOP_DETECTED = 508
  public static def NOT_EXTENDED = 510
  public static def NETWORK_AUTHENTICATION_REQUIRED = 511



}
