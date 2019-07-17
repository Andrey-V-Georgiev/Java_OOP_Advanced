package common;

public class ConstantMessages {

    public static final String SUCCESSFULLY_ADDED_PLAYER =
            "Successfully added player of type %s with username: %s";

    public static final String SUCCESSFULLY_ADDED_CARD =
            "Successfully added card of type %sCard with name: %s";

    public static final String SUCCESSFULLY_ADDED_PLAYER_WITH_CARDS
            = "Successfully added card: %s to user: %s";

    public static final String FIGHT_INFO
            = "Attack user health %s - Enemy user health %s";

    public static final String PLAYER_REPORT_INFO
            = "Username: %s - Health: %d - Cards %d";

    public static final String CARD_REPORT_INFO
            = "Card: %s - Damage: %d";

    public static final String DEFAULT_REPORT_SEPARATOR
            = "###";
    public static final String PLAYER_USERNAME_EXCEPTION
            = "Player's username cannot be null or an empty string. ";
    public static final String PLAYER_HEALTH_EXCEPTION
            = "Player's health bonus cannot be less than zero. ";
    public static final String PLAYER_DAMAGE_POINTS_EXCEPTION
            = "Damage points cannot be less than zero.";
    public static final String CARD_DAMAGE_POINTS_EXCEPTION
            = "Card's damage points cannot be less than zero.";
    public static final String CARD_HEALTH_POINTS_EXCEPTION
            = "Card's HP cannot be less than zero.";
    public static final String CARD_NULL_EXCEPTION
            = "Card cannot be null!";
    public static final String CARD_ALREADY_EXISTS
            = "Card %s already exists!";
    public static  final String PLAYER_IS_DEAD
            = "Player is dead!";

}
