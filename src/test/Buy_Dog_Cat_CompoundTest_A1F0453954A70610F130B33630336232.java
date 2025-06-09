/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class Buy_Dog_Cat_CompoundTest_A1F0453954A70610F130B33630336232
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public Buy_Dog_Cat_CompoundTest_A1F0453954A70610F130B33630336232(IContainer parent, String name) {
		super(parent, "Buy_Dog_Cat", "A1F0453954A70610F130B33630336232");
	}

	public void execute() {

		this.add(new test.Buy_Cat_Test_A1F0453927F8E200F130B33630336232(this, "A1F045395B1C5040F130B33630336232") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Buy_Dog_Test_A1F045387E905A40F130B33630336232(this, "A1F045395B1C5043F130B33630336232") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}