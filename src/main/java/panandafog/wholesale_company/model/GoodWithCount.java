package panandafog.wholesale_company.model;

import javax.persistence.*;

@Entity
@Table(name = "most_popular_goods")
public class GoodWithCount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(name = "count", nullable = false)
    private float count;

    public GoodWithCount() {
    }

    public GoodWithCount(String name, float count) {
        this.name = name;
        this.count = count;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCount() {
        return count;
    }

    public void setCount(float count) {
        this.count = count;
    }
}
