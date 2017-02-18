package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Scrap {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(name="variant_id")
	private int variantId;
	@Column(name="user_id")
	private int userId;
	@Column(name="error_desc_id")
	private int errorDescId;
	@Column(name="quantity")
	private double quantity;
	@Column(name="order_number")
	private String orderNumber;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date")
	private Date date;
	
	public Scrap(){}
	
	public Scrap(int id, int variantId, int userId, int errorDescId, double quantity, String orderNumber, Date date) {
		super();
		this.id = id;
		this.variantId = variantId;
		this.userId = userId;
		this.errorDescId = errorDescId;
		this.quantity = quantity;
		this.orderNumber = orderNumber;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVariantId() {
		return variantId;
	}
	public void setVariantId(int variantId) {
		this.variantId = variantId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getErrorDescId() {
		return errorDescId;
	}
	public void setErrorDescId(int errorDescId) {
		this.errorDescId = errorDescId;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getOrder() {
		return orderNumber;
	}
	public void setOrder(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Scrap [id=" + id + ", variantId=" + variantId + ", userId=" + userId + ", errorDescId=" + errorDescId
				+ ", quantity=" + quantity + ", order=" + orderNumber + ", date=" + date + "]";
	}
	
	
}
