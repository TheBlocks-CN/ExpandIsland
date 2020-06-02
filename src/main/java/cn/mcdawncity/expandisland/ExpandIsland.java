package cn.mcdawncity.expandisland;

import cn.mcdawncity.expandisland.utils.Configuration;
import org.bukkit.Bukkit;
import org.serverct.parrot.parrotx.PPlugin;
import org.serverct.parrot.parrotx.hooks.VaultUtil;

public final class ExpandIsland extends PPlugin {

    private static VaultUtil vaultUtil = null;

    public static VaultUtil getVaultUtil() {
        return vaultUtil;
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        getLogger().info("插件已卸载");
    }

    @Override
    protected void preload() {
        this.pConfig = new Configuration(this);
        this.pConfig.init();
    }

    @Override
    protected void load() {
        getLogger().info("正在加载ExpandIsland，版本" + getDescription().getVersion());
        vaultUtil = new VaultUtil(this, true);
        if (!vaultUtil.isHooks())
            Bukkit.getPluginManager().disablePlugin(this);
        getLogger().info("正在使用模式");
    }
}
