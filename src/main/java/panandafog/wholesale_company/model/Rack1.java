package panandafog.wholesale_company.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "warehouse1")
public class Rack1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @NotNull
    private Good good;
    @Column(name = "good_count", nullable = false)
    private Long goodCount;

    public Rack1() {
    }

    public Rack1(long goodId, long goodCount) {
        this.goodCount = goodCount;
        this.good = new Good();
        this.good.setId(goodId);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Long getGood_id() {
        return good.getId();
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public Long getGood_count() {
        return goodCount;
    }

    public void setGood_count(long goodCount) {
        this.goodCount = goodCount;
    }
}
