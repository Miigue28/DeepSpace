module WeaponType
  class Type
    def initialize(value)
      @power = value
    end

    def getPower
      @power
    end
  end

  LASER = Type.new(2.0)
  MISSILE = Type.new(3.0)
  PLASMA = Type.new(4.0)
end
