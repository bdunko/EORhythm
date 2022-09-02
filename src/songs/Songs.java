package songs;


public class Songs {
	public static SongScore EO3_S1_Score = new EO3_S1_WaterfallWoods_Score(Songs.class.getResource("/resources/EO3_St1.wav"), 97500, 1);
	public static SongScore EO3_S2_Score = new EO3_S2_WaterWoodsOfTheSubmarineRidge_Score(Songs.class.getResource("/resources/EO3_St2.wav"), 107000, 4);
	public static SongScore EO3_S3_Score = new EO3_S3_CavernOfSplendor_Score(Songs.class.getResource("/resources/EO3_St3.wav"), 105000, 5);
	public static SongScore EO3_S4_Score = new EO3_S4_TheBlueSeaTempleOfRitual_Score(Songs.class.getResource("/resources/EO3_St4.wav"), 80000, 14);
	public static SongScore EO3_S5_Score = new EO3_S5_ChalkyWoods_Score(Songs.class.getResource("/resources/EO3_St5.wav"), 102000, 6);
	public static SongScore EO3_S6_Score = new EO3_S6_TheVengefulGodInTheDarkOceanAbyss_Score(Songs.class.getResource("/resources/EO3_St6.wav"), 105000, 7);
	
	public static SongScore EO3_B1_Score = new EO3_B1_TheFirstCampaign_Score(Songs.class.getResource("/resources/EO3_B1.wav"), 185000, 2);
	public static SongScore EO3_B2_Score = new EO3_B2_ThoseThatSlayAndFall_Score(Songs.class.getResource("/resources/EO3_B2.wav"), 105000, 8);
	public static SongScore EO3_B3_Score = new EO3_B3_IsThatBloodThineOrTheEnemys_Score(Songs.class.getResource("/resources/EO3_B3.wav"), 103000, 9);
	public static SongScore EO3_B4_Score = new EO3_B4_HoistTheSwordWithPrideInTheHeart_Score(Songs.class.getResource("/resources/EO3_B4.wav"), 103000, 10);
	public static SongScore EO3_B5_Score = new EO3_B5_TheirOwnBrandOfJustice_Score(Songs.class.getResource("/resources/EO3_B5.wav"), 104000, 11);
	public static SongScore EO3_B6_Score = new EO3_B6_CallingThatDetestableName_Score(Songs.class.getResource("/resources/EO3_B6.wav"), 110000, 3);
	public static SongScore EO3_B7_Score = new EO3_B7_TheEndOfTheRagingWaves_Score(Songs.class.getResource("/resources/EO3_B7.wav"), 104000, 12);
	public static SongScore EO3_B8_Score = new EO3_B8_ScatterAbout_Score(Songs.class.getResource("/resources/EO3_B8.wav"), 130000, 13);
	
	public static SongScore EO3_T1_Score = new EO3_T1_TheAncientCapitolEnvelopedByTheGreatTree_Score(Songs.class.getResource("/resources/EO3_T1.wav"), 102000, 15);
	public static SongScore EO3_T2_Score = new EO3_T2_TheKingForgottenByTime(Songs.class.getResource("/resources/EO3_T2.wav"), 70000, 16);
	//greenGradiantBg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/greengradiant_bg.png"));
	
	public static void resetSongs(){
		EO3_S1_Score = new EO3_S1_WaterfallWoods_Score(Songs.class.getResource("/resources/EO3_St1.wav"), 97500, 1);
		EO3_S2_Score = new EO3_S2_WaterWoodsOfTheSubmarineRidge_Score(Songs.class.getResource("/resources/EO3_St2.wav"), 120000, 4);
		EO3_S3_Score = new EO3_S3_CavernOfSplendor_Score(Songs.class.getResource("/resources/EO3_St3.wav"), 105000, 5);
		EO3_S4_Score = new EO3_S4_TheBlueSeaTempleOfRitual_Score(Songs.class.getResource("/resources/EO3_St4.wav"), 80000, 14);
		EO3_S5_Score = new EO3_S5_ChalkyWoods_Score(Songs.class.getResource("/resources/EO3_St5.wav"), 102000, 6);
		EO3_S6_Score = new EO3_S6_TheVengefulGodInTheDarkOceanAbyss_Score(Songs.class.getResource("/resources/EO3_St6.wav"), 105000, 7);
		
		EO3_B1_Score = new EO3_B1_TheFirstCampaign_Score(Songs.class.getResource("/resources/Eo3_B1.wav"), 185000, 2);
		EO3_B2_Score = new EO3_B2_ThoseThatSlayAndFall_Score(Songs.class.getResource("/resources/EO3_B2.wav"), 105000, 8);
		EO3_B3_Score = new EO3_B3_IsThatBloodThineOrTheEnemys_Score(Songs.class.getResource("/resources/EO3_B3.wav"), 103000, 9);
		EO3_B4_Score = new EO3_B4_HoistTheSwordWithPrideInTheHeart_Score(Songs.class.getResource("/resources/EO3_B4.wav"), 103000, 10);
		EO3_B5_Score = new EO3_B5_TheirOwnBrandOfJustice_Score(Songs.class.getResource("/resources/EO3_B5.wav"), 104000, 11);
		EO3_B6_Score = new EO3_B6_CallingThatDetestableName_Score(Songs.class.getResource("/resources/EO3_B6.wav"), 110000, 3);
		EO3_B7_Score = new EO3_B7_TheEndOfTheRagingWaves_Score(Songs.class.getResource("/resources/EO3_B7.wav"), 104000, 12);
		EO3_B8_Score = new EO3_B8_ScatterAbout_Score(Songs.class.getResource("/resources/EO3_B8.wav"), 133000, 13);
		
		EO3_T1_Score = new EO3_T1_TheAncientCapitolEnvelopedByTheGreatTree_Score(Songs.class.getResource("/resources/EO3_T1.wav"), 102000, 15);
		EO3_T2_Score = new EO3_T2_TheKingForgottenByTime(Songs.class.getResource("/resources/EO3_T2.wav"), 70000, 16);
	}
}
