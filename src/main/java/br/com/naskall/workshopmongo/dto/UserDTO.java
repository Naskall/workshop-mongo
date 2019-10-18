package br.com.naskall.workshopmongo.dto;

import java.io.Serializable;
import java.util.Objects;

import br.com.naskall.workshopmongo.domain.User;

public class UserDTO implements Serializable{
  private static final long serialVersionUID=1L;  
  private String id;
  private String name;
  private String email;

  public UserDTO(String id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserDTO id(String id) {
    this.id = id;
    return this;
  }

  public UserDTO name(String name) {
    this.name = name;
    return this;
  }

  public UserDTO email(String email) {
    this.email = email;
    return this;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserDTO)) {
            return false;
        }
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(id, userDTO.id) && Objects.equals(name, userDTO.name) && Objects.equals(email, userDTO.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email);
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", name='" + getName() + "'" +
      ", email='" + getEmail() + "'" +
      "}";
  }

  public UserDTO() {

  }

  public UserDTO(User obj) {
    id = obj.getId();
    name = obj.getName();
    email = obj.getEmail();
  }
}