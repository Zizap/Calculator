enum RomanNumeral {

    ONE("I",1),
    TWO("II",2),
    THREE("III",3),
    FOUR("IV",4),
    FIVE("V",5),
    SIX("VI",6),
    SEVEN("VII",7),
    EIGHT("VIII",8),
    NINE("IX",9),
    TEN("X",10),
    ELEVEN("XI",11),
    TWELVE("XII",12),
    THIRTEEN("XIII",13),
    FOURTEEN("XIV",14),
    FIFTEEN("XV",15),
    SIXTEEN("XVI",16),
    SEVENTEEN("XVII",17),
    EIGHTEEN("XVIII",18),
    NINETEEN("XIX",19),
    TWENTY("XX",20),
    TWENTY_ONE("XXI", 21),
    TWENTY_TWO("XXII", 22),
    TWENTY_THREE("XXIII", 23),
    TWENTY_FOUR("XXIV", 24),
    TWENTY_FIVE("XXV", 25),
    TWENTY_SIX("XXVI", 26),
    TWENTY_SEVEN("XXVII", 27),
    TWENTY_EIGHT("XXVIII", 28),
    TWENTY_NINE("XXIX", 29),
    THIRTY("XXX", 30),
    THIRTY_ONE("XXXI", 31),
    THIRTY_TWO("XXXII", 32),
    THIRTY_THREE("XXXIII", 33),
    THIRTY_FOUR("XXXIV", 34),
    THIRTY_FIVE("XXXV", 35),
    THIRTY_SIX("XXXVI", 36),
    THIRTY_SEVEN("XXXVII", 37),
    THIRTY_EIGHT("XXXVIII", 38),
    THIRTY_NINE("XXXIX", 39),
    FORTY("XL", 40),
    FORTY_ONE("XLI", 41),
    FORTY_TWO("XLII", 42),
    FORTY_THREE("XLIII", 43),
    FORTY_FOUR("XLIV", 44),
    FORTY_FIVE("XLV", 45),
    FORTY_SIX("XLVI", 46),
    FORTY_SEVEN("XLVII", 47),
    FORTY_EIGHT("XLVIII", 48),
    FORTY_NINE("XLIX", 49),
    FIFTY("L", 50),
    FIFTY_ONE("LI", 51),
    FIFTY_TWO("LII", 52),
    FIFTY_THREE("LIII", 53),
    FIFTY_FOUR("LIV", 54),
    FIFTY_FIVE("LV", 55),
    FIFTY_SIX("LVI", 56),
    FIFTY_SEVEN("LVII", 57),
    FIFTY_EIGHT("LVIII", 58),
    FIFTY_NINE("LIX", 59),
    SIXTY("LX", 60),
    SIXTY_ONE("LXI", 61),
    SIXTY_TWO("LXII", 62),
    SIXTY_THREE("LXIII", 63),
    SIXTY_FOUR("LXIV", 64),
    SIXTY_FIVE("LXV", 65),
    SIXTY_SIX("LXVI", 66),
    SIXTY_SEVEN("LXVII", 67),
    SIXTY_EIGHT("LXVIII", 68),
    SIXTY_NINE("LXIX", 69),
    SEVENTY("LXX", 70),
    SEVENTY_ONE("LXXI", 71),
    SEVENTY_TWO("LXXII", 72),
    SEVENTY_THREE("LXXIII", 73),
    SEVENTY_FOUR("LXXIV", 74),
    SEVENTY_FIVE("LXXV", 75),
    SEVENTY_SIX("LXXVI", 76),
    SEVENTY_SEVEN("LXXVII", 77),
    SEVENTY_EIGHT("LXXVIII", 78),
    SEVENTY_NINE("LXXIX", 79),
    EIGHTY("LXXX", 80),
    EIGHTY_ONE("LXXXI", 81),
    EIGHTY_TWO("LXXXII", 82),
    EIGHTY_THREE("LXXXIII", 83),
    EIGHTY_FOUR("LXXXIV", 84),
    EIGHTY_FIVE("LXXXV", 85),
    EIGHTY_SIX("LXXXVI", 86),
    EIGHTY_SEVEN("LXXXVII", 87),
    EIGHTY_EIGHT("LXXXVIII", 88),
    EIGHTY_NINE("LXXXIX", 89),
    NINETY("XC", 90),
    NINETY_ONE("XCI", 91),
    NINETY_TWO("XCII", 92),
    NINETY_THREE("XCIII", 93),
    NINETY_FOUR("XCIV", 94),
    NINETY_FIVE("XCV", 95),
    NINETY_SIX("XCVI", 96),
    NINETY_SEVEN("XCVII", 97),
    NINETY_EIGHT("XCVIII", 98),
    NINETY_NINE("XCIX", 99),
    HUNDRED("C", 100);


    final String romanNumeral;
    final int arabicNumeral;

    RomanNumeral(String romanNumeral,int arabicNumeral){
        this.arabicNumeral = arabicNumeral;
        this.romanNumeral = romanNumeral;
    }


}