# AnarchyCore
### All in one plugin for Anarchy Servers
___

### Features

* Very Configurable
* Patch Boat Fly
* Customizable Help Message
* Kill Command  
* Gamemode Aliases
* Hide Connection Msgs Command
* Custom Discord Command
* Patch Lag caused by elytras/entities/redstone

### Config
<details>

```yml
prefix: "&8[&2&lAnarchy&4&lCore&r&8]&r "
# Commands
gamemode-aliases-cmd: true
toggle-connection-msgs-cmd: true
help-command: true
discord-command: true
kill-command: true
# Exploits
patch-boatfly: false
disable-redstone-tps: 15
delete-entities-tps: 5
disable-elytra-tps: 13
# Features
random-motd: true
in-game-motd: true
# Messages
messages:
  connection-cmd-on: "&aConnection messages are now SHOWN"
  connection-cmd-off: "&cConnection messages are now HIDDEN"
  join-message: "&7%player% joined the game"
  quit-message: "&7%player% has left the game"
  discord-message: "&cOfficial Discord: &2https://discord.gg/JEuhBr3GWg"
  command-disabled: "&cCommand Disabled"
  in-game-motd: "&4Welcome to hell, cunt"
  help-message:
    - "&6-----------------------------------------------------"
    - "&3/w <player> - Send pm to player"
    - "&3/r - Reply to last pm"
    - "&3/ignore <player> - Ignore someones messages"
    - "&3/ignorelist - See ignore list"
    - "&3/togglechat - Toggle chat messages entirely"
    - "&3/togglewhispering - Toggle whether you receive pms"
    - "&3/toggledeathmsg - Toggle death messages"
    - "&3/namecolour <colour> - Change Namecolour"
    - "&3/namecolourcheck - See remaining namecolor time"
    - "&3/vote - Vote for the server 8hrs of namecolour each link"
    - "&3/discord - Official Link"
    - "&3/tcm - Toggle connection messages."
    - "&3/kill - Kill yourself."
    - "&6-----------------------------------------------------"

```
</details>
