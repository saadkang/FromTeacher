package newHouseBuilding;

public abstract class SemiHouse implements NeighborHood, House {
	
	public void niceNeighbor(){
		System.out.println("Neighborhood should be crime free.");
		
	}
	public void rooms(){
		System.out.println("The house I want built needs to have more that 6 bedrooms");
	}
	public abstract void floors();

}
