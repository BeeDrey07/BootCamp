package Chapter6;

import java.util.*;

public final class FavoriteFoods { // Not an immutable object declaration
    private final ArrayList<String> favoriteFoods;

    public FavoriteFoods(ArrayList<String> favoriteFoods) {
        if (favoriteFoods == null || favoriteFoods.size() == 0)
            throw new RuntimeException("favoriteFoods is required");
//        this.favoriteFoods = favoriteFoods;
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsItem(int index) {
        return favoriteFoods.get(index);
    }

    public static void main(String[] args) {
        ArrayList<String> ff = new ArrayList<>();
        ff.add("Pizza");
        FavoriteFoods favfoods= new FavoriteFoods(ff);
        System.out.println(favfoods.getFavoriteFoodsItem(0));
        ff.clear();
        ff.add("Wings");
        System.out.println(favfoods.getFavoriteFoodsItem(0));
    }
}

