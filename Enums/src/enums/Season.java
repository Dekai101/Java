
package enums;

 public enum Season{
        WINTER("HIVERN"),
        SPRING("PRIMAVERA"),
        SUMMER("ESTIU"),
        FALL("TARDOR");

        private final String seasonCat;

        private Season(String seasonCat) {
            this.seasonCat = seasonCat;
        }

        public String getSeasonCat() {
            return this.seasonCat;
        }
    }
