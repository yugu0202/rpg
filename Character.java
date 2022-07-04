class Character
{
	private String name;
	private String job;
	private HashMap<String,int> status = new HashMap<String,int>();

	Character(String name)
	{
		this.name = name;
	}

	void SetJob(String job)
	{
		this.job = job;

		switch (job)
		{
			case "attacker":
				status.put("lv",1);
				status.put("hp",100);
				status.put("mp",20);
				status.put("atk",50);
				status.put("matk",20);
				status.put("def",35);
				status.put("mdef",25);
				status.put("spd",40);
				break;
			case "magician":
				status.put("lv",1);
				status.put("hp",80);
				status.put("mp",60);
				status.put("atk",20);
				status.put("matk",50);
				status.put("def",25);
				status.put("mdef",25);
				status.put("spd",30);
				break;
		}
	}

	HashMap<String,int> GetStatus()
	{
		return status;
	}
}
