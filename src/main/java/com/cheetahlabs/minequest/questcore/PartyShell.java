package com.cheetahlabs.minequest.questcore;

import java.util.ArrayList;

import org.monksanctum.MineQuest.Quester.Quester;

public class PartyShell extends Party {
	
	public PartyShell(Quester quester) {
		questers = new ArrayList<Quester>();
		questers.add(quester);
	}

}
