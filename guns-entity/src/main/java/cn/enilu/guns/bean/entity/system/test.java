package cn.enilu.guns.bean.entity.system;


import javax.persistence.*;

@Entity
@Table(name="t_test")
public class test {

  public int id;
  public String name;
  public String addres;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }
    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }
    @Basic
    @Column(name = "addres")
    public String getAddres() {
        return addres;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
}
