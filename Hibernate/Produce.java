package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Produce")
public class Produce {
	@Id
    @GeneratedValue
    @Column(name="produceID")
	private Integer produceID;
	
	@Column(name="produceCode")
	private String produceCode;
	
	@Column(name="produceName")
	private String produceName;
	
	@ManyToOne
	@JoinColumn(name="categoryID")
	private Integer categoryID;
	
	public Produce() {}

	public Produce(Integer produceID, Integer categoryID, String produceCode,
			String produceName, Integer priceID) {
		super();
		this.productID = produceID;
		this.categoryID = categoryID;
		this.productCode = produceCode;
		this.productName = produceName;
		this.categoryID = priceID;
	}

	private Integer getProduceID() {
		return produceID;
	}

	private void setProduceID(Integer produceID) {
		this.produceID = produceID;
	}

	private String getProduceCode() {
		return produceCode;
	}

	private void setProduceCode(String produceCode) {
		this.produceCode = produceCode;
	}

	private String getProduceName() {
		return produceName;
	}

	private void setProduceName(String produceName) {
		this.produceName = produceName;
	}

	private Integer getCategoryID() {
		return categoryID;
	}

	private void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}
	
	
	
}