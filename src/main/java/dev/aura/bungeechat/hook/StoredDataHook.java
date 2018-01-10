package dev.aura.bungeechat.hook;

import dev.aura.bungeechat.api.account.BungeeChatAccount;
import dev.aura.bungeechat.api.hook.BungeeChatHook;
import dev.aura.bungeechat.api.hook.HookManager;
import java.util.Optional;

public class StoredDataHook implements BungeeChatHook {
  @Override
  public Optional<String> getPrefix(BungeeChatAccount account) {
    return account.getStoredPrefix();
  }

  @Override
  public Optional<String> getSuffix(BungeeChatAccount account) {
    return account.getStoredSuffix();
  }

  @Override
  public int getPriority() {
    return HookManager.ACCOUNT_PREFIX_PRIORITY;
  }
}
