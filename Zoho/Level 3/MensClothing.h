class MensClothing
{
    int small, med, large, xlarge, everything;

public:
    MensClothing(int small, int med, int large, int xlarge)
    {
        this->small = small;
        this->med = med;
        this->large = large;
        this->xlarge = xlarge;
        this->everything = small + med + large + xlarge;
    }

    void buySmall()
    {
        if (small >= 0)
        {
            small--;
            everything--;
        }
    }

    void buyMed()
    {
        if (med >= 0)
        {
            med--;
            everything--;
        }
    }

    void buyLarge()
    {
        if (large >= 0)
        {
            large--;
            everything--;
        }
    }

    void buyXlarge()
    {
        if (xlarge >= 0)
        {
            xlarge--;
            everything--;
        }
    }

    int smallStock()
    {
        return small;
    }

    int medStock()
    {
        return med;
    }

    int largeStock()
    {
        return large;
    }

    int xlargeStock()
    {
        return xlarge;
    }

    int totalStock()
    {
        return everything;
    }

    void restockSmall(int n)
    {
        small += n;
        everything += n;
    }

    void restockMed(int n)
    {
        med += n;
        everything += n;
    }

    void restockLarge(int n)
    {
        large += n;
        everything += n;
    }

    void restockXlarge(int n)
    {
        xlarge += n;
        everything += n;
    }
};
