package DDDTutorial_Modd;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;

import DDDTutorial_Modd.D3.D3_Drawbl_Atom;
import DDDTutorial_Modd.D3.Drawbl_D3_Polygon;
import DDDTutorial_Modd.D3.Multi_Object;
import DDDTutorial_Modd.D3.Polyhedron;
import CC.Encycloped.Abs.Scal.Gom.RL_LOc_Havr;
import CC.Encycloped.Abs.Scal.Physc.SIt.Drawbl_Atom;

public class Graph extends Multi_Object<D3_Drawbl_Atom>
{
	public double BtwEn,Unit;
		public void Set_MesrmNtg(double BtwEn,double Unit)
		{
			this.BtwEn=BtwEn;
			this.Unit=Unit;
		}
	public int LNg;

	public RL_LOc_Havr[] VrtXg;
		@Lin_DclAr @Finishd(Is_Finishd=true)
		public void Set_VrtXg()
		{
			VrtXg=new RL_LOc_Havr[LNg+1];
			for(int X=0;X<LNg+1;X+=1)
			{VrtXg[X]=new RL_LOc_Havr_ConcrEt(this,
				X*Unit,
				0,
				0);
			}
		}

	public D3_Drawbl_Atom[] Drawbl_Atomg;
	@Override @Finishd(Is_Finishd=false)
	public void Set_Drawbl_Atomg()
	{
		this.Drawbl_Atomg=new Drawbl_D3_Polygon[LNg];
		Polyhedron=new Polyhedron(this,null);
//		for()
	}
	@Override @Finishd(Is_Finishd=false)
	public void Intract(Drawbl_Atom Atom)
	{}

	@Override @Finishd(Is_Finishd=false)
	public void Tik()
	{}

	public Graph(RL_LOc_Havr Parnt,Object LOc_SOrc,
		double BtwEn,double Unit,int LNg)
	{
		super(Parnt,LOc_SOrc);

		Set_MesrmNtg(BtwEn,Unit);
		this.LNg=LNg;

		Set_Drawbl_Atomg();
	}
}