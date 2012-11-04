/**
 * This work is licensed under the Creative Commons
 * Attribution-ShareAlike 3.0 Unported License. To view a copy of this
 * license, visit http://creativecommons.org/licenses/by-sa/3.0/.
 */

package extrabiomes.events;

import extrabiomes.configuration.ExtrabiomesConfig;

public class ModulePreInitEvent extends ModuleEvent {

	public final ExtrabiomesConfig	config;

	public ModulePreInitEvent(ExtrabiomesConfig config) {
		this.config = config;
	}

}