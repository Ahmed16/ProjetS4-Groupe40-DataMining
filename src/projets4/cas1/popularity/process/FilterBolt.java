package projets4.cas1.popularity.process;

import backtype.storm.generated.Bolt;

/**
 * This class receive tuples with large number of elements and emit new tuple to specific following bolt using only interested areas. 
 * For example, (id_video id_uploader id_tag) and only this bolt will emit id_video to bolt1, id_uploader to bolt2, etc. 
 * @author sbt
 *
 */
public class FilterBolt extends Bolt{

	/**
	 * 
	 */
	private static final long serialVersionUID = 632265333724495194L;

}
