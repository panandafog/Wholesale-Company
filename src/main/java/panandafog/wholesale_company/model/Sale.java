package panandafog.wholesale_company.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @NotNull
    private Good good;
    @Column(name = "good_count", nullable = false)
    private Long goodCount;
    @Temporal(TemporalType.DATE)
    @Column(name = "create_date", nullable = false)
    private Date createDate;

    public Sale() {
    }

    public Sale(long goodId, long goodCount) {
        this.goodCount = goodCount;
        this.good = new Good();
        this.setCreate_date(new Date());

        this.good.setId(goodId);
    }

    public Sale(long goodID, long goodCount, Date createDate) {
        this.goodCount = goodCount;
        this.good = new Good();
        this.good.setId(goodID);
        this.createDate = createDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public Long getGood_id() {
        return good.getId();
    }

    public Long getGood_count() {
        return goodCount;
    }

    public void setGood_count(Long goodCount) {
        this.goodCount = goodCount;
    }

    public Date getCreate_date() {
        return createDate;
    }

    public void setCreate_date(Date createDate) {
        this.createDate = createDate;
    }
}

