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
	}
}
