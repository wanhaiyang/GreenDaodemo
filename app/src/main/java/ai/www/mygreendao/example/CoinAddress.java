package ai.www.mygreendao.example;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Unique;

import java.io.Serializable;

/**
 * Created by 火龙裸 on 2018/1/2.
 */
@Entity
public class CoinAddress implements Serializable
{
    private static final long serialVersionUID = 536871008;
    public static final int TYPE_ID = 0x01;

    // 不能用int
    @Id(autoincrement = true)
    private Long id;

    // 品种ID
    @NotNull
    @Unique
    private int coinId;

    // 品种名称简写 Property标注，外键不能引用
    @Property(nameInDb = "shortName")
    private String shortName;

    // 对应品种的充值地址
    @Property(nameInDb = "chongzhiAddress")
    private String chongzhiAddress;

    @Generated(hash = 1282505242)
    public CoinAddress(Long id, int coinId, String shortName, String chongzhiAddress)
    {
        this.id = id;
        this.coinId = coinId;
        this.shortName = shortName;
        this.chongzhiAddress = chongzhiAddress;
    }

    @Generated(hash = 65962064)
    public CoinAddress()
    {
    }

    public Long getId()
    {
        return this.id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public int getCoinId()
    {
        return this.coinId;
    }

    public void setCoinId(int coinId)
    {
        this.coinId = coinId;
    }

    public String getShortName()
    {
        return this.shortName;
    }

    public void setShortName(String shortName)
    {
        this.shortName = shortName;
    }

    public String getChongzhiAddress()
    {
        return this.chongzhiAddress;
    }

    public void setChongzhiAddress(String chongzhiAddress)
    {
        this.chongzhiAddress = chongzhiAddress;
    }

    @Override
    public String toString()
    {
        return "CoinAddress{" + "id=" + id + ", coinId=" + coinId + ", shortName='" //
                + shortName + '\'' + ", chongzhiAddress='" + chongzhiAddress + '\'' + '}';
    }
}
