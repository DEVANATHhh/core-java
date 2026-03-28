class TreeRunner
{
	public static void main(String...names)
	{
		System.out.println("-------------------------------SAVING METHOD-----------------------------");
		String[] treeNames=new String[8];
		Tree tree=new Tree(treeNames);
		
		tree.getTreeName(null);
		tree.getTreeName("Neem");
		tree.getTreeName("Mango");
		tree.getTreeName("Banyan");
		tree.getTreeName("Peepal");
		tree.getTreeName("Coconut");
		tree.getTreeName("Teak");
		tree.getTreeName("Sandalwood");
		tree.getTreeName("Ashoka");
		tree.getTreeName("Palm");
		
		System.out.println("-------------------------------SEARCHING METHOD-----------------------------");

		tree.getSearchName("Neem");
		tree.getSearchName("Mango");
		tree.getSearchName("Banyan");
		tree.getSearchName("Peepal");
		tree.getSearchName("Coconut");
		tree.getSearchName("Teak");
		tree.getSearchName("Sandalwood");
		tree.getSearchName("Ashoka");
		tree.getSearchName("Neem");

		System.out.println("-------------------------------UPDATING METHOD-----------------------------");

		tree.updateTreeNameByIndex(0,"Neem Tree");
		tree.updateTreeNameByIndex(1,"Mango Tree");

		tree.getSearchName("Neem Tree");
		tree.getSearchName("Mango Tree");

		System.out.println("-------------------------------DELETING METHOD-----------------------------");

		tree.deleteTreeNameByIndex(0);
		tree.deleteTreeNameByIndex(1);

		tree.getSearchName("Neem Tree");
		tree.getSearchName("Mango Tree");
	}
}