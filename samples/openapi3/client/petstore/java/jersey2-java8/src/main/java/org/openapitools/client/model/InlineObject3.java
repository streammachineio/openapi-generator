/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * InlineObject3
 */
@JsonPropertyOrder({
  InlineObject3.JSON_PROPERTY_INTEGER,
  InlineObject3.JSON_PROPERTY_INT32,
  InlineObject3.JSON_PROPERTY_INT64,
  InlineObject3.JSON_PROPERTY_NUMBER,
  InlineObject3.JSON_PROPERTY_FLOAT,
  InlineObject3.JSON_PROPERTY_DOUBLE,
  InlineObject3.JSON_PROPERTY_STRING,
  InlineObject3.JSON_PROPERTY_PATTERN_WITHOUT_DELIMITER,
  InlineObject3.JSON_PROPERTY_BYTE,
  InlineObject3.JSON_PROPERTY_BINARY,
  InlineObject3.JSON_PROPERTY_DATE,
  InlineObject3.JSON_PROPERTY_DATE_TIME,
  InlineObject3.JSON_PROPERTY_PASSWORD,
  InlineObject3.JSON_PROPERTY_CALLBACK
})

public class InlineObject3 {
  public static final String JSON_PROPERTY_INTEGER = "integer";
  private Integer integer;

  public static final String JSON_PROPERTY_INT32 = "int32";
  private Integer int32;

  public static final String JSON_PROPERTY_INT64 = "int64";
  private Long int64;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private BigDecimal number;

  public static final String JSON_PROPERTY_FLOAT = "float";
  private Float _float;

  public static final String JSON_PROPERTY_DOUBLE = "double";
  private Double _double;

  public static final String JSON_PROPERTY_STRING = "string";
  private String string;

  public static final String JSON_PROPERTY_PATTERN_WITHOUT_DELIMITER = "pattern_without_delimiter";
  private String patternWithoutDelimiter;

  public static final String JSON_PROPERTY_BYTE = "byte";
  private byte[] _byte;

  public static final String JSON_PROPERTY_BINARY = "binary";
  private File binary;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_DATE_TIME = "dateTime";
  private OffsetDateTime dateTime = OffsetDateTime.parse("2010-02-01T17:20:10.111110+08:00[Asia/Hong_Kong]", java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME.withZone(java.time.ZoneId.systemDefault()));

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_CALLBACK = "callback";
  private String callback;


  public InlineObject3 integer(Integer integer) {
    
    this.integer = integer;
    return this;
  }

   /**
   * None
   * minimum: 10
   * maximum: 100
   * @return integer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "None")
  @JsonProperty(JSON_PROPERTY_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInteger() {
    return integer;
  }


  public void setInteger(Integer integer) {
    this.integer = integer;
  }


  public InlineObject3 int32(Integer int32) {
    
    this.int32 = int32;
    return this;
  }

   /**
   * None
   * minimum: 20
   * maximum: 200
   * @return int32
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "None")
  @JsonProperty(JSON_PROPERTY_INT32)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInt32() {
    return int32;
  }


  public void setInt32(Integer int32) {
    this.int32 = int32;
  }


  public InlineObject3 int64(Long int64) {
    
    this.int64 = int64;
    return this;
  }

   /**
   * None
   * @return int64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "None")
  @JsonProperty(JSON_PROPERTY_INT64)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getInt64() {
    return int64;
  }


  public void setInt64(Long int64) {
    this.int64 = int64;
  }


  public InlineObject3 number(BigDecimal number) {
    
    this.number = number;
    return this;
  }

   /**
   * None
   * minimum: 32.1
   * maximum: 543.2
   * @return number
  **/
  @ApiModelProperty(required = true, value = "None")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getNumber() {
    return number;
  }


  public void setNumber(BigDecimal number) {
    this.number = number;
  }


  public InlineObject3 _float(Float _float) {
    
    this._float = _float;
    return this;
  }

   /**
   * None
   * maximum: 987.6
   * @return _float
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "None")
  @JsonProperty(JSON_PROPERTY_FLOAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getFloat() {
    return _float;
  }


  public void setFloat(Float _float) {
    this._float = _float;
  }


  public InlineObject3 _double(Double _double) {
    
    this._double = _double;
    return this;
  }

   /**
   * None
   * minimum: 67.8
   * maximum: 123.4
   * @return _double
  **/
  @ApiModelProperty(required = true, value = "None")
  @JsonProperty(JSON_PROPERTY_DOUBLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getDouble() {
    return _double;
  }


  public void setDouble(Double _double) {
    this._double = _double;
  }


  public InlineObject3 string(String string) {
    
    this.string = string;
    return this;
  }

   /**
   * None
   * @return string
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "None")
  @JsonProperty(JSON_PROPERTY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getString() {
    return string;
  }


  public void setString(String string) {
    this.string = string;
  }


  public InlineObject3 patternWithoutDelimiter(String patternWithoutDelimiter) {
    
    this.patternWithoutDelimiter = patternWithoutDelimiter;
    return this;
  }

   /**
   * None
   * @return patternWithoutDelimiter
  **/
  @ApiModelProperty(required = true, value = "None")
  @JsonProperty(JSON_PROPERTY_PATTERN_WITHOUT_DELIMITER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPatternWithoutDelimiter() {
    return patternWithoutDelimiter;
  }


  public void setPatternWithoutDelimiter(String patternWithoutDelimiter) {
    this.patternWithoutDelimiter = patternWithoutDelimiter;
  }


  public InlineObject3 _byte(byte[] _byte) {
    
    this._byte = _byte;
    return this;
  }

   /**
   * None
   * @return _byte
  **/
  @ApiModelProperty(required = true, value = "None")
  @JsonProperty(JSON_PROPERTY_BYTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public byte[] getByte() {
    return _byte;
  }


  public void setByte(byte[] _byte) {
    this._byte = _byte;
  }


  public InlineObject3 binary(File binary) {
    
    this.binary = binary;
    return this;
  }

   /**
   * None
   * @return binary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "None")
  @JsonProperty(JSON_PROPERTY_BINARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public File getBinary() {
    return binary;
  }


  public void setBinary(File binary) {
    this.binary = binary;
  }


  public InlineObject3 date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * None
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "None")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    this.date = date;
  }


  public InlineObject3 dateTime(OffsetDateTime dateTime) {
    
    this.dateTime = dateTime;
    return this;
  }

   /**
   * None
   * @return dateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-02-02T20:20:20.222220Z", value = "None")
  @JsonProperty(JSON_PROPERTY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateTime() {
    return dateTime;
  }


  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }


  public InlineObject3 password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * None
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "None")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public InlineObject3 callback(String callback) {
    
    this.callback = callback;
    return this;
  }

   /**
   * None
   * @return callback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "None")
  @JsonProperty(JSON_PROPERTY_CALLBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallback() {
    return callback;
  }


  public void setCallback(String callback) {
    this.callback = callback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject3 inlineObject3 = (InlineObject3) o;
    return Objects.equals(this.integer, inlineObject3.integer) &&
        Objects.equals(this.int32, inlineObject3.int32) &&
        Objects.equals(this.int64, inlineObject3.int64) &&
        Objects.equals(this.number, inlineObject3.number) &&
        Objects.equals(this._float, inlineObject3._float) &&
        Objects.equals(this._double, inlineObject3._double) &&
        Objects.equals(this.string, inlineObject3.string) &&
        Objects.equals(this.patternWithoutDelimiter, inlineObject3.patternWithoutDelimiter) &&
        Arrays.equals(this._byte, inlineObject3._byte) &&
        Objects.equals(this.binary, inlineObject3.binary) &&
        Objects.equals(this.date, inlineObject3.date) &&
        Objects.equals(this.dateTime, inlineObject3.dateTime) &&
        Objects.equals(this.password, inlineObject3.password) &&
        Objects.equals(this.callback, inlineObject3.callback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integer, int32, int64, number, _float, _double, string, patternWithoutDelimiter, Arrays.hashCode(_byte), binary, date, dateTime, password, callback);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject3 {\n");
    sb.append("    integer: ").append(toIndentedString(integer)).append("\n");
    sb.append("    int32: ").append(toIndentedString(int32)).append("\n");
    sb.append("    int64: ").append(toIndentedString(int64)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    patternWithoutDelimiter: ").append(toIndentedString(patternWithoutDelimiter)).append("\n");
    sb.append("    _byte: ").append(toIndentedString(_byte)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
