package powercrystals.minefactoryreloaded.api;

import net.minecraftforge.common.ForgeDirection;

/**
 * @author skyboy
 *
 * Defines a target for the Laser Drill Precharger
 */
public interface IFactoryLaserTarget
{
	/**
	 * @param from The direction the laser is coming from
	 * @return true if the precharger can form a beam from this side
	 */
	public boolean canFormBeamWith(ForgeDirection from);
	
	/**
	 * @param from The direction the power is coming from
	 * @param power The amount of power being transferred
	 * @param simulate true if this transaction will only be simulated
	 * @return The amount of energy not consumed
	 */
	public int addEnergy(ForgeDirection from, int power, boolean simulate);
}
