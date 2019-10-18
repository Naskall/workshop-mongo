package br.com.naskall.workshopmongo.resources.exception;

import java.io.Serializable;
import java.util.Objects;

public class StandardError implements Serializable{
  private static final long serialVersionUID=1L;
  private long timestamp;
  private Integer status;
  private String error;
  private String message;
  private String path;
  

  public StandardError() {
  }

  public StandardError(long timestamp, Integer status, String error, String message, String path) {
    this.timestamp = timestamp;
    this.status = status;
    this.error = error;
    this.message = message;
    this.path = path;
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  public Integer getStatus() {
    return this.status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getError() {
    return this.error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getPath() {
    return this.path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public StandardError timestamp(long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public StandardError status(Integer status) {
    this.status = status;
    return this;
  }

  public StandardError error(String error) {
    this.error = error;
    return this;
  }

  public StandardError message(String message) {
    this.message = message;
    return this;
  }

  public StandardError path(String path) {
    this.path = path;
    return this;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof StandardError)) {
            return false;
        }
        StandardError standardError = (StandardError) o;
        return timestamp == standardError.timestamp && Objects.equals(status, standardError.status) && Objects.equals(error, standardError.error) && Objects.equals(message, standardError.message) && Objects.equals(path, standardError.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, status, error, message, path);
  }

  @Override
  public String toString() {
    return "{" +
      " timestamp='" + getTimestamp() + "'" +
      ", status='" + getStatus() + "'" +
      ", error='" + getError() + "'" +
      ", message='" + getMessage() + "'" +
      ", path='" + getPath() + "'" +
      "}";
  }
}