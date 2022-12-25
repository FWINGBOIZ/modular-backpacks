2022-12-23 05:02

Status: #idea

Tags

# Orbit Pumps - V0.1

#### Supports MC Version: 1.19

The initial release of [[Orbit Pumps]] should be robust, but simple enough to accomplish in a couple of weeks. To that end the 0.1 build will include:

- [ ] A configuration file for variables
- [ ] A pump block
    - [ ] Capable of “pumping” water at high rates
    - [ ] Supporting the forge fluid handling capability

## Clarifications and Conditions

- The pump block must be in contact with water on at least two of its four cardinal sides to function.
- The pump block does not actually remove water from the world, instead filling an internal reservoir.
    - This behavior will likely be exclusive to water, different approaches may be needed for other fluids in future.

## Decisions:

- [ ] Should the pump be waterlogged?
    - Waterlogged blocks are a cool addition to MC and would “modernize” the mod.
    - Could allow for a good path to upgrades, with an upgrade relaxing the pump requirement to only waterlogged.
- [ ] Is the pump scope too narrow?
    - On the one hand, haviOng a very narrow scope is highly configurable for pack creators and may increase use of the mod.
    - On the other, I can see us eventually wanting to have a set of tanks as part of this system, and having multiple mods for “stuff that handles fluids” seems silly.

## Docs:
[[Orbit Pumps - V0.1 Docs]]

---
## References
- [Iron Chests](https://github.com/progwml6/ironchest)