SUMMARY = "Tool to assist in network address calculations for IPv4 and IPv6."

SECTION = "net"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://cropping/COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"


SRC_URI = "git://gitlab.com/development9083447/pluginnew.git;protocol=https;branch=master"
SRCREV = "4c4261a47f355946ee74013d4f5d0494487cc2d6"

S = "${WORKDIR}/cropping/git"

inherit meson
