package pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

@Entity


public class Artist {


	//bean properties
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="AID")
	private Integer aid;
	 @Column(name="NAME",length=15)
	private String name;
	 @Column(name="ADDRS")
	private String ADDRS;
	 @Column(name="Mobileno")
	private Long mobileno;
	 @Column(name="category")
	 private String category;
	 public Integer getAid() {
	  return aid;
	 }
	 public void setAid(Integer aid) {
	  this.aid = aid;
	 }
	 public String getName() {
	  return name;
	 }
	 public void setName(String name) {
	  this.name = name;
	 }
	 public String getADDRS() {
	  return ADDRS;
	 }
	 public void setADDRS(String aDDRS) {
	  ADDRS = aDDRS;
	 }
	 public Long getMobileno() {
	  return mobileno;
	 }
	 public void setMobileno(Long mobileno) {
	  this.mobileno = mobileno;
	 }
	 public String getCategory() {
	  return category;
	 }
	 public void setCategory(String category) {
	  this.category = category;
	 }
	 @Override
	 public String toString() {
	  return "Artist [aid=" + aid + ", name=" + name + ", ADDRS=" + ADDRS + ", mobileno=" + mobileno + ", category="
	    + category + "]";
	 }

	public Artist() {
	  System.out.println("calling default constructor");
	 }
	public Artist( String name, String aDDRS, Long mobileno, String category) {
	 System.out.println("calling para constructor");
	 
	 this.name = name;
	 ADDRS = aDDRS;
	 this.mobileno = mobileno;
	 this.category = category;
	}
	}