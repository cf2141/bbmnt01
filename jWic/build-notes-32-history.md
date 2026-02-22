



root@bnd01:/etc/netplan#
root@bnd01:/etc/netplan# nmcli g
STATE         CONNECTIVITY  WIFI-HW  WIFI     WWAN-HW  WWAN
disconnected  unknown       missing  enabled  missing  enabled
root@bnd01:/etc/netplan# cat /etc/NetworkManager/NetworkManager.conf
[main]
plugins=ifupdown,keyfile

[ifupdown]
managed=false

[device]
wifi.scan-rand-mac-address=no
root@bnd01:/etc/netplan# ip a
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
    inet6 ::1/128 scope host noprefixroute
       valid_lft forever preferred_lft forever
2: eno1: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc fq_codel state UP group default qlen 1000
    link/ether 88:51:fb:69:78:0b brd ff:ff:ff:ff:ff:ff
    altname enp0s25
    inet 10.10.89.92/24 brd 10.10.89.255 scope global eno1
       valid_lft forever preferred_lft forever
    inet6 fe80::8a51:fbff:fe69:780b/64 scope link
       valid_lft forever preferred_lft forever
root@bnd01:/etc/netplan# ifconfig eno1
eno1: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 10.10.89.92  netmask 255.255.255.0  broadcast 10.10.89.255
        inet6 fe80::8a51:fbff:fe69:780b  prefixlen 64  scopeid 0x20<link>
        ether 88:51:fb:69:78:0b  txqueuelen 1000  (Ethernet)
        RX packets 3655278  bytes 1225667477 (1.2 GB)
        RX errors 0  dropped 98  overruns 0  frame 0
        TX packets 802763  bytes 185216372 (185.2 MB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0
        device interrupt 20  memory 0xf7c00000-f7c20000

root@bnd01:/etc/netplan# nmcli can show
Error: argument 'can' not understood. Try passing --help instead.
root@bnd01:/etc/netplan# nmcli con show

root@bnd01:/etc/netplan# nmcli con show --activate
Error: --activate - no such connection profile.
root@bnd01:/etc/netplan# nmcli con show --active

root@bnd01:/etc/netplan# nmcli g
STATE         CONNECTIVITY  WIFI-HW  WIFI     WWAN-HW  WWAN
disconnected  unknown       missing  enabled  missing  enabled
root@bnd01:/etc/netplan# nmcli con show

root@bnd01:/etc/netplan# lspci -nn | grep -i net
00:19.0 Ethernet controller [0200]: Intel Corporation 82579LM Gigabit Network Connection (Lewisville) [8086:1502] (rev 04)
root@bnd01:/etc/netplan# nmcli c s

root@bnd01:/etc/netplan# nmcli
eno1: unmanaged
        "Intel 82579LM"
        ethernet (e1000e), 88:51:FB:69:78:0B, hw, mtu 1500

lo: unmanaged
        "lo"
        loopback (unknown), 00:00:00:00:00:00, sw, mtu 65536

Use "nmcli device show" to get complete information about known devices and
"nmcli connection show" to get an overview on active connection profiles.

Consult nmcli(1) and nmcli-examples(7) manual pages for complete usage details.
root@bnd01:/etc/netplan# nmcli g
STATE         CONNECTIVITY  WIFI-HW  WIFI     WWAN-HW  WWAN
disconnected  unknown       missing  enabled  missing  enabled
root@bnd01:/etc/netplan# nmcli device show eno1
GENERAL.DEVICE:                         eno1
GENERAL.TYPE:                           ethernet
GENERAL.HWADDR:                         88:51:FB:69:78:0B
GENERAL.MTU:                            1500
GENERAL.STATE:                          10 (unmanaged)
GENERAL.CONNECTION:                     --
GENERAL.CON-PATH:                       --
WIRED-PROPERTIES.CARRIER:               on
IP4.ADDRESS[1]:                         10.10.89.92/24
IP4.GATEWAY:                            10.10.89.1
IP4.ROUTE[1]:                           dst = 0.0.0.0/0, nh = 10.10.89.1, mt = 0
IP4.ROUTE[2]:                           dst = 10.10.89.0/24, nh = 0.0.0.0, mt = 0
IP6.ADDRESS[1]:                         fe80::8a51:fbff:fe69:780b/64
IP6.GATEWAY:                            --
IP6.ROUTE[1]:                           dst = fe80::/64, nh = ::, mt = 256
root@bnd01:/etc/netplan# journalctl -n 1000 -u NetworkManager -u wpa_supplicant
Feb 22 18:48:30 bnd01 systemd[1]: Starting wpa_supplicant.service - WPA supplicant...
Feb 22 18:48:30 bnd01 systemd[1]: Started wpa_supplicant.service - WPA supplicant.
Feb 22 18:48:30 bnd01 wpa_supplicant[35559]: Successfully initialized wpa_supplicant
Feb 22 18:48:33 bnd01 systemd[1]: Starting NetworkManager.service - Network Manager...
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.7666] NetworkManager (version 1.46.0) is starting... (boot:63003060-eac6-4f89-b37>
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.7666] Read config: /etc/NetworkManager/NetworkManager.conf (lib: 10-default-firew>
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.7700] manager[0x5c68d892c1f0]: monitoring kernel firmware directory '/lib/firmwar>
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.7700] monitoring ifupdown state file '/run/network/ifstate'.
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8389] hostname: hostname: using hostnamed
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8389] hostname: static hostname changed from (none) to "bnd01"
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8392] dns-mgr: init: dns=systemd-resolved rc-manager=unmanaged (auto), plugin=sys>
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8395] manager[0x5c68d892c1f0]: rfkill: Wi-Fi hardware radio set enabled
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8395] manager[0x5c68d892c1f0]: rfkill: WWAN hardware radio set enabled
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8402] Loaded device plugin: NMAtmManager (/usr/lib/x86_64-linux-gnu/NetworkManage>
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8409] Loaded device plugin: NMWwanFactory (/usr/lib/x86_64-linux-gnu/NetworkManag>
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8413] Loaded device plugin: NMBluezManager (/usr/lib/x86_64-linux-gnu/NetworkMana>
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8418] Loaded device plugin: NMTeamFactory (/usr/lib/x86_64-linux-gnu/NetworkManag>
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8420] Loaded device plugin: NMWifiFactory (/usr/lib/x86_64-linux-gnu/NetworkManag>
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8422] manager: rfkill: Wi-Fi enabled by radio killswitch; enabled by state file
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8423] manager: rfkill: WWAN enabled by radio killswitch; enabled by state file
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8423] manager: Networking is enabled by state file
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8426] settings: Loaded settings plugin: ifupdown ("/usr/lib/x86_64-linux-gnu/Netw>
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8426] settings: Loaded settings plugin: keyfile (internal)
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8426] ifupdown: management mode: unmanaged
Feb 22 18:48:33 bnd01 NetworkManager[35699]: <info>  [1771786113.8426] ifupdown: interfaces file /etc/network/interfaces doesn't exist
Feb 22 18:48:34 bnd01 NetworkManager[35699]: <info>  [1771786114.3219] dhcp: init: Using DHCP client 'internal'
Feb 22 18:48:34 bnd01 NetworkManager[35699]: <info>  [1771786114.3222] manager: (lo): new Loopback device (/org/freedesktop/NetworkManager/Devices>
Feb 22 18:48:34 bnd01 NetworkManager[35699]: <info>  [1771786114.3230] device (eno1): carrier: link connected
Feb 22 18:48:34 bnd01 NetworkManager[35699]: <info>  [1771786114.3236] manager: (eno1): new Ethernet device (/org/freedesktop/NetworkManager/Devic>
Feb 22 18:48:34 bnd01 NetworkManager[35699]: <info>  [1771786114.3242] failed to open /run/network/ifstate
Feb 22 18:48:34 bnd01 systemd[1]: Started NetworkManager.service - Network Manager.
Feb 22 18:48:34 bnd01 NetworkManager[35699]: <info>  [1771786114.3249] bus-manager: acquired D-Bus service "org.freedesktop.NetworkManager"
Feb 22 18:48:34 bnd01 NetworkManager[35699]: <info>  [1771786114.3254] manager: startup complete
Feb 22 18:48:34 bnd01 NetworkManager[35699]: <info>  [1771786114.3268] modem-manager: ModemManager available
Feb 22 18:48:34 bnd01 NetworkManager[35699]: <info>  [1771786114.3638] ifupdown: interfaces file /etc/network/interfaces doesn't exist
Feb 22 18:48:34 bnd01 NetworkManager[35699]: <info>  [1771786114.8383] audit: op="connections-reload" pid=35768 uid=0 result="success"
root@bnd01:/etc/netplan# nmcli gen log level debug
root@bnd01:/etc/netplan# nmcli con s

root@bnd01:/etc/netplan# nmcli dev status
DEVICE  TYPE      STATE      CONNECTION
eno1    ethernet  unmanaged  --
lo      loopback  unmanaged  --
root@bnd01:/etc/netplan# nmcli connection show

root@bnd01:/etc/netplan# nmcli d show eno1
GENERAL.DEVICE:                         eno1
GENERAL.TYPE:                           ethernet
GENERAL.HWADDR:                         88:51:FB:69:78:0B
GENERAL.MTU:                            1500
GENERAL.STATE:                          10 (unmanaged)
GENERAL.CONNECTION:                     --
GENERAL.CON-PATH:                       --
WIRED-PROPERTIES.CARRIER:               on
IP4.ADDRESS[1]:                         10.10.89.92/24
IP4.GATEWAY:                            10.10.89.1
IP4.ROUTE[1]:                           dst = 0.0.0.0/0, nh = 10.10.89.1, mt = 0
IP4.ROUTE[2]:                           dst = 10.10.89.0/24, nh = 0.0.0.0, mt = 0
IP6.ADDRESS[1]:                         fe80::8a51:fbff:fe69:780b/64
IP6.GATEWAY:                            --
IP6.ROUTE[1]:                           dst = fe80::/64, nh = ::, mt = 256
root@bnd01:/etc/netplan# nmcli d
DEVICE  TYPE      STATE      CONNECTION
eno1    ethernet  unmanaged  --
lo      loopback  unmanaged  --
root@bnd01:/etc/netplan# ls -l /usr/lib/NetworkManager/conf.d/
total 16
-rw-r--r-- 1 root root  35 Oct 27 19:11 10-default-firewall-use-iptables.conf
-rw-r--r-- 1 root root 225 Oct 27 19:11 10-dns-resolved.conf
-rw-r--r-- 1 root root  80 Oct 27 19:11 10-globally-managed-devices.conf
-rw-r--r-- 1 root root 306 Jul 21  2025 no-mac-addr-change.conf
root@bnd01:/etc/netplan# ls -l /usr/lib/NetworkManager/conf.d/10-globally-managed-devices.conf
-rw-r--r-- 1 root root 80 Oct 27 19:11 /usr/lib/NetworkManager/conf.d/10-globally-managed-devices.conf
root@bnd01:/etc/netplan# cat /usr/lib/NetworkManager/conf.d/10-globally-managed-devices.conf
[keyfile]
unmanaged-devices=*,except:type:wifi,except:type:gsm,except:type:cdma
root@bnd01:/etc/netplan# ls -l /etc/NetworkManager/NetworkManager.conf
-rw-r--r-- 1 root root 98 Oct 27 19:11 /etc/NetworkManager/NetworkManager.conf
root@bnd01:/etc/netplan# cat /etc/NetworkManager/NetworkManager.conf
[main]
plugins=ifupdown,keyfile

[ifupdown]
managed=false

[device]
wifi.scan-rand-mac-address=no
root@bnd01:/etc/netplan# ethtool eno1
Settings for eno1:
	Supported ports: [ TP ]
	Supported link modes:   10baseT/Half 10baseT/Full
	                        100baseT/Half 100baseT/Full
	                        1000baseT/Full
	Supported pause frame use: Symmetric Receive-only
	Supports auto-negotiation: Yes
	Supported FEC modes: Not reported
	Advertised link modes:  10baseT/Half 10baseT/Full
	                        100baseT/Half 100baseT/Full
	                        1000baseT/Full
	Advertised pause frame use: Symmetric Receive-only
	Advertised auto-negotiation: Yes
	Advertised FEC modes: Not reported
	Link partner advertised link modes:  10baseT/Half 10baseT/Full
	                                     100baseT/Half 100baseT/Full
	                                     1000baseT/Half 1000baseT/Full
	Link partner advertised pause frame use: Symmetric Receive-only
	Link partner advertised auto-negotiation: Yes
	Link partner advertised FEC modes: Not reported
	Speed: 1000Mb/s
	Duplex: Full
	Auto-negotiation: on
	Port: Twisted Pair
	PHYAD: 1
	Transceiver: internal
	MDI-X: on (auto)
	Supports Wake-on: pumbg
	Wake-on: g
        Current message level: 0x00000007 (7)
                               drv probe link
	Link detected: yes
root@bnd01:/etc/netplan# nmcli d
DEVICE  TYPE      STATE      CONNECTION
eno1    ethernet  unmanaged  --
lo      loopback  unmanaged  --
root@bnd01:/etc/netplan# nmcli connection up id eno1
Error: unknown connection 'eno1'.
root@bnd01:/etc/netplan# nmcli d
DEVICE  TYPE      STATE      CONNECTION
eno1    ethernet  unmanaged  --
lo      loopback  unmanaged  --
root@bnd01:/etc/netplan# nmcli connection up id eno1
Error: unknown connection 'eno1'.
root@bnd01:/etc/netplan# ls -l /etc/network/interfaces
ls: cannot access '/etc/network/interfaces': No such file or directory
root@bnd01:/etc/netplan# nmcli d
DEVICE  TYPE      STATE      CONNECTION
eno1    ethernet  unmanaged  --
lo      loopback  unmanaged  --
root@bnd01:/etc/netplan# nmcli d
DEVICE  TYPE      STATE      CONNECTION
eno1    ethernet  unmanaged  --
lo      loopback  unmanaged  --
root@bnd01:/etc/netplan#
root@bnd01:/etc/netplan#
root@bnd01:/etc/netplan# echo '[keyfile]' > /etc/NetworkManager/conf.d/10-globally-managed-devices.conf
root@bnd01:/etc/netplan# cat /etc/NetworkManager/NetworkManager.conf
[main]
plugins=ifupdown,keyfile

[ifupdown]
managed=false

[device]
wifi.scan-rand-mac-address=no
root@bnd01:/etc/netplan# echo '[keyfile]'
[keyfile]
root@bnd01:/etc/netplan# systemctl restart NetworkManager
root@bnd01:/etc/netplan# nmcli d
DEVICE  TYPE      STATE                   CONNECTION
lo      loopback  connected (externally)  lo
eno1    ethernet  unmanaged               --
root@bnd01:/etc/netplan# nmcli d
DEVICE  TYPE      STATE                   CONNECTION
lo      loopback  connected (externally)  lo
eno1    ethernet  unmanaged               --
root@bnd01:/etc/netplan# nmcli d
DEVICE  TYPE      STATE                   CONNECTION
lo      loopback  connected (externally)  lo
eno1    ethernet  unmanaged               --
root@bnd01:/etc/netplan# nmcli dev set eno1 managed yes
root@bnd01:/etc/netplan# nmcli d
DEVICE  TYPE      STATE                   CONNECTION
eno1    ethernet  connected (externally)  eno1
lo      loopback  connected (externally)  lo
