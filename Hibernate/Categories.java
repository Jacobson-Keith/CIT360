package hibernate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="CATEGORIES")

public class Categories {
	@Id
    @GeneratedValue
    @Column(name="categoryID")
    private Long categoryId;
     
    @Column(name="categoryName")
    private String categoryName;
     
    @OneToMany(mappedBy="categories")
    private Set<Produce> produce;

	public Categories(Long categoryId, String categoryName,
			Set<Produce> produce) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.produce = produce;
	}

	private Long getCategoryId() {
		return categoryId;
	}

	private void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	private String getCategoryName() {
		return categoryName;
	}

	private void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	private Set<Produce> getProduce() {
		return produce;
	}

	private void setProduce(Set<Produce> produce) {
		this.produce = produce;
	}
    
    
    
}