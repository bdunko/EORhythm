package songs;

import game.Trigger;

import java.net.URL;

/*
 * 1 = tap
 * 2 = up
 * 3 = down
 * 4 = left
 * 5 = right
 * 6 = hold_start
 * 7 = hold_end
 */
public class EO3_S1_WaterfallWoods_Score extends SongScore{
	public EO3_S1_WaterfallWoods_Score(URL filePath, int length, int style){
		super(filePath, length, style);
		score.add(new Trigger(1, 4, 1565)); //1
		score.add(new Trigger(1, 1, 1805)); //2
		score.add(new Trigger(1, 1, 2145)); //3
		score.add(new Trigger(1, 3, 2815)); //4
		score.add(new Trigger(1, 1, 3135)); //5
		score.add(new Trigger(1, 4, 3405)); //6
		score.add(new Trigger(1, 4, 4715)); //7
		score.add(new Trigger(1, 2, 5345)); //8
		score.add(new Trigger(1, 1, 5995)); //9
		score.add(new Trigger(1, 3, 6535)); //10
		score.add(new Trigger(1, 2, 6865)); //11
		score.add(new Trigger(1, 1, 7185)); //12
		score.add(new Trigger(1, 3, 8485)); //13
		score.add(new Trigger(1, 2, 8755)); //14
		score.add(new Trigger(1, 3, 9015)); //15
		score.add(new Trigger(1, 1, 9365)); //16
		score.add(new Trigger(5, 1, 11005)); //17
		score.add(new Trigger(1, 1, 14695)); //18
		score.add(new Trigger(2, 2, 15645)); //19
		score.add(new Trigger(3, 2, 15895)); //20
		score.add(new Trigger(2, 3, 16885)); //21
		score.add(new Trigger(3, 2, 17225)); //22
		score.add(new Trigger(2, 2, 18155)); //23
		score.add(new Trigger(3, 3, 18455)); //24
		score.add(new Trigger(2, 3, 19455)); //25
		score.add(new Trigger(3, 3, 19795)); //26
		score.add(new Trigger(2, 4, 21965)); //27
		score.add(new Trigger(3, 2, 22255)); //28
		score.add(new Trigger(1, 3, 24775)); //29
		score.add(new Trigger(2, 4, 25705)); //30
		score.add(new Trigger(3, 3, 25965)); //31
		score.add(new Trigger(2, 1, 26955)); //32
		score.add(new Trigger(3, 4, 27215)); //33
		score.add(new Trigger(1, 2, 28575)); //34
		score.add(new Trigger(1, 2, 28815)); //35
		score.add(new Trigger(1, 3, 29105)); //36
		score.add(new Trigger(1, 4, 29415)); //37
		score.add(new Trigger(5, 1, 29795)); //38
		score.add(new Trigger(1, 3, 30795)); //39
		score.add(new Trigger(1, 2, 31075)); //40
		score.add(new Trigger(2, 1, 31985)); //41
		score.add(new Trigger(3, 4, 32275)); //42
		score.add(new Trigger(1, 4, 34615)); //43
		score.add(new Trigger(1, 2, 35005)); //44
		score.add(new Trigger(5, 4, 35815)); //45
		score.add(new Trigger(4, 1, 36125)); //46
		score.add(new Trigger(2, 3, 37015)); //47
		score.add(new Trigger(3, 4, 37315)); //48
		score.add(new Trigger(2, 3, 38325)); //49
		//bug fix on count
		score.add(new Trigger(3, 3, 38565)); //51
		score.add(new Trigger(5, 1, 39615)); //52
		score.add(new Trigger(4, 2, 39885)); //53
		score.add(new Trigger(1, 2, 42135)); //54
		score.add(new Trigger(1, 4, 42355)); //55
		score.add(new Trigger(1, 3, 44865)); //56
		score.add(new Trigger(2, 3, 45885)); //57
		score.add(new Trigger(3, 4, 46175)); //58
		score.add(new Trigger(5, 2, 47185)); //59
		score.add(new Trigger(4, 1, 47485)); //60
		score.add(new Trigger(1, 4, 48765)); //61
		score.add(new Trigger(1, 4, 49005)); //62
		score.add(new Trigger(1, 4, 49275)); //63
		score.add(new Trigger(1, 4, 49595)); //64
		score.add(new Trigger(1, 1, 49935)); //65
		score.add(new Trigger(2, 1, 50935)); //66
		score.add(new Trigger(3, 4, 51215)); //67
		score.add(new Trigger(1, 1, 52165)); //68
		score.add(new Trigger(1, 1, 52445)); //69
		score.add(new Trigger(1, 2, 54985)); //70
		score.add(new Trigger(5, 4, 56285)); //71
		score.add(new Trigger(2, 3, 57205)); //72
		score.add(new Trigger(3, 1, 57475)); //73
		score.add(new Trigger(3, 4, 59775)); //74
		score.add(new Trigger(2, 1, 60015)); //75
		score.add(new Trigger(1, 2, 61325)); //76
		score.add(new Trigger(3, 3, 62255)); //77
		score.add(new Trigger(2, 1, 62525)); //78
		score.add(new Trigger(3, 3, 64825)); //79
		score.add(new Trigger(2, 2, 65115)); //80
		score.add(new Trigger(1, 4, 66375)); //81
		score.add(new Trigger(1, 3, 67305)); //82
		score.add(new Trigger(1, 4, 67635)); //83
		score.add(new Trigger(2, 4, 69855)); //84
		score.add(new Trigger(3, 2, 70135)); //85
		score.add(new Trigger(1, 1, 71375)); //86
		score.add(new Trigger(1, 3, 72335)); //87
		score.add(new Trigger(1, 4, 72685)); //88
		score.add(new Trigger(5, 4, 74045)); //89
		score.add(new Trigger(2, 2, 75305)); //90
		score.add(new Trigger(2, 3, 76535)); //91
		score.add(new Trigger(3, 3, 77475)); //92
		score.add(new Trigger(2, 2, 77765)); //93
		score.add(new Trigger(2, 3, 79065)); //94
		score.add(new Trigger(1, 1, 80225)); //95
		score.add(new Trigger(1, 2, 81465)); //96
		score.add(new Trigger(1, 1, 82475)); //97
		score.add(new Trigger(1, 4, 82825)); //98
		score.add(new Trigger(1, 1, 84045)); //99
		score.add(new Trigger(1, 3, 85525)); //100
		score.add(new Trigger(2, 2, 86575)); //101
		score.add(new Trigger(3, 2, 87515)); //102
		score.add(new Trigger(2, 3, 87835)); //103
		score.add(new Trigger(3, 2, 89085)); //104
		score.add(new Trigger(1, 2, 90355)); //105
		score.add(new Trigger(1, 2, 91615)); //106
		score.add(new Trigger(2, 2, 92575)); //107
		score.add(new Trigger(3, 3, 92905)); //108
		score.add(new Trigger(1, 2, 94165)); //109
	}
}
