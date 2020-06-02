package cn.mcdawncity.expandisland.utils;

import org.serverct.parrot.parrotx.PPlugin;
import org.serverct.parrot.parrotx.config.PConfig;
import org.serverct.parrot.parrotx.hooks.VaultUtil;
import org.serverct.parrot.parrotx.utils.I18n;

import java.io.File;

public class Configuration extends PConfig {
    public static boolean VAULT_MODE;

    public Configuration(PPlugin plugin) {
        super(plugin, "config", "主配置文件");
    }

    @Override
    public void saveDefault() {
        plugin.saveDefaultConfig();
    }

    @Override
    public void load(File file) {
        VAULT_MODE = config.getBoolean("Mode.Vault");
        if (VAULT_MODE){
            this.plugin.lang.log("正在使用 &b花费玩家金币 &7模式运行.", I18n.Type.INFO, false);
        } else {
            this.plugin.lang.log("正在使用 &c花费背包物品 &7模式运行.", I18n.Type.INFO, false);
        }
    }
}
